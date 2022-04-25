import React from 'react';
import { useEffect, useState, useReducer } from "react";
import { useParams } from "react-router-dom";
import Nevbar from "./Nevbar";
//import Post from "./components/Post";
import { Container, Button, Card} from 'react-bootstrap';
import axios from 'axios';

function Detail(prop){
  //const {id} = useParams();
  const id = prop.match.params.id;
  const [post, setPost] = useState([]);

  const getPost = async() => {
    const response = await fetch(`/post/${id}`);
    const json = await response.json();
    setPost(json);
  };
  useEffect(() => {
    getPost();
  }, []);

  const deletePost = (prop) => {
    const id = prop.target.id;
    console.log(prop.target.id);
    axios.delete("/post/"+id).then(window.location.replace("/main"));
  }

  console.log(post);

  return <Container>
  <Nevbar /> 
  <Card>
    <Card.Body>
      <Card.Subtitle className="mb-2 text-muted">{post.userId} {post.datetime}</Card.Subtitle>
      <Card.Text>{post.contents}</Card.Text>
    </Card.Body>
  </Card>
  {
    (post.userId==="00")?
    <div align="right"> <Button id={post.id} variant="light" size="sm" href={`/modify/${post.id}`}>수정</Button> 
      <Button id={post.id} variant="light" size="sm" onClick={deletePost}>삭제</Button></div>:""
  }
</Container>
}
export default Detail;