//import {Link} from "react-router-dom";
//import "./bootstrap.min.css";
import React from 'react';
import { Card, Button } from 'react-bootstrap';
import axios from 'axios';

function Post({id, userId, uploadDate, content}) {
  return (
    <Card
      onClick={()=>window.location.href=`/detail/${id}`}
      >
      <Card.Body>
        <Card.Subtitle className="mb-2 text-muted">{userId} {uploadDate}</Card.Subtitle>
        <Card.Text>{content}</Card.Text>
      </Card.Body>
    </Card>
  );
}

export default Post;