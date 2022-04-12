import {useEffect, useState} from "react";
import { Container, InputGroup, FormControl, Button } from 'react-bootstrap';

import Post from "./components/Post";
import Nevbar from "./Nevbar";

function Main() {
  // const [message, setMessage] = useState([]);
  /* useEffect(() => {
    fetch("/posts")
      .then((response) => {
         return response.json();
      })
      .then(function (data) {
        setMessage(data);
      });
  }, []); */
  const [loading, setLoading] = useState(true);
  const [posts, setPosts] = useState([]);

  const getPosts = async() => {
    const response = await fetch("/posts");
    const json = await response.json();
    setPosts(json);
    setLoading(false);
  };
  useEffect(() => {
    getPosts();
  }, []);

  console.log(posts)

  return (
    <Container>
      <Nevbar />
      <InputGroup className="mb-3">
        <FormControl
          placeholder="내용을 입력하세요."
          as="textarea" aria-label="With textarea"
        />
        <Button>등록</Button>
      </InputGroup>
        {loading ? <h1>Loading...</h1>: 
      <div>
        {posts.map(post => 
          <Post
            id={post.id}
            userId={post.userid}
            datetime={post.datetime}
            contents={post.contents}/>
        )}
      </div>}
    </Container>
    
  );
}

export default Main;
