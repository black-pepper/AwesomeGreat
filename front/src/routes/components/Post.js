//import {Link} from "react-router-dom";
//import "./bootstrap.min.css";
import { Card, Button } from 'react-bootstrap';
import axios from 'axios';

function Post({id, userId, datetime, contents}) {
  const deletePost = (prop) => {
    const id = prop.target.id;
    console.log(prop.target.id);
    axios.delete("/post/"+id).then(window.location.replace("/main"));
  }

  return (
    <Card
      onClick={()=>window.location.href=`/detail/${id}`}
      >
      <Card.Body>
        <Card.Subtitle className="mb-2 text-muted">{userId} {datetime}</Card.Subtitle>
        <Card.Text>{contents}</Card.Text>
      </Card.Body>
    </Card>
  );
}

export default Post;