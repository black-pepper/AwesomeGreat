import {useEffect, useState} from "react";
import { Container, InputGroup, Form, FormControl, Button } from 'react-bootstrap';

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
    const response = await fetch("/post?postId=0&cnt=10");
    const json = await response.json();
    setPosts(json);
    setLoading(false);
  };
  useEffect(() => {
    getPosts();
  }, []);

  return (
    <Container>
      <Nevbar />
      <Form action="/post" method="post">
        <InputGroup className="mb-3">
          <FormControl
            placeholder="내용을 입력하세요."
            as="textarea" aria-label="With textarea"
            name="content"
          />
          <Button type="submit">등록</Button>
        </InputGroup>
      </Form>
        {loading ? <h1>Loading...</h1>: 
      <div>
        {posts.map(post => 
          <Post
            id={post.id}
            userId={post.userId}
            uploadDate={post.uploadDate}
            content={post.content}/>
        )}
      </div>}
    </Container>
    
  );
}

export default Main;