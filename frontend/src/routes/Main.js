import {useEffect, useState} from "react";
import Post from "./components/Post";

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
    <div className="App">
        
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
    </div>
    
  );
}

export default Main;
