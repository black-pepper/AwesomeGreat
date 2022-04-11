//import {Link} from "react-router-dom";
//import "./bootstrap.min.css";
import { Card } from 'react-bootstrap';

function Post({id, userId, datetime, contents}) {
  console.log(id, userId, datetime, contents);
  return (
    <Card
      //onClick={()=>window.location.href=`/detail/${id}`}
      >
      <Card.Body>
        <div>{userId} {datetime}</div>
        <div>{contents}</div>
      </Card.Body>
    </Card>
  );
}

export default Post;