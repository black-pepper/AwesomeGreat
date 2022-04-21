import { useEffect, useState, useReducer } from "react";
import { useParams } from "react-router-dom";
import Nevbar from "./Nevbar";
//import Post from "./components/Post";
import { Container, Button, Card, Form} from 'react-bootstrap';
import axios from 'axios';

function Modify(prop){
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

  return <Container>
  <Nevbar /> 
  <div>
    <Card>
      <Card.Body>
        <Form action={`/post/${post.id}`} method="post">
            <Form.Group className="mb-3" controlId="exampleForm.ControlTextarea1">
                <Form.Label>게시글 수정</Form.Label>
                <Form.Control 
                    name="contents"
                    as="textarea" 
                    rows={3} 
                />
            </Form.Group>
            <Button id={post.id} variant="light" size="sm" href={`/detail/${post.id}`}>취소</Button>
            <Button id={post.id} variant="light" size="sm" type="submit">수정</Button>
        </Form>
      </Card.Body>
    </Card>
  </div>
</Container>
}
export default Modify;