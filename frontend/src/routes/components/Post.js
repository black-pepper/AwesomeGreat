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
      //onClick={()=>window.location.href=`/detail/${id}`}
      >
      <Card.Body>
        <div>{userId} {datetime} {
          (userId==="00")?
            <div> <Button id={id} variant="light" size="sm" href={`/detail/${id}`}>수정</Button> 
             <Button id={id} variant="light" size="sm" onClick={deletePost}>삭제</Button></div>:""
        }</div>
        <div>{contents}</div>
      </Card.Body>
    </Card>
  );
}

export default Post;