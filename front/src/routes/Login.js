import React from 'react';
import { Container, Form, Row, Col, Card, Button } from 'react-bootstrap';
import Nevbar from "./Nevbar";

function Login() {
  return (<Container>
    <Nevbar />
    <Card>
      <Card.Body><form action="/login" method="post">
          
        <Form.Group as={Row} className="mb-3" controlId="formPlaintextPassword">
            <Form.Label column sm="2">
            아이디
            </Form.Label>
            <Col sm="10">
            <Form.Control type="id" placeholder="아이디" name="loginId" />
            </Col>
        </Form.Group>

        <Form.Group as={Row} className="mb-3" controlId="formPlaintextPassword">
            <Form.Label column sm="2">
            비밀번호
            </Form.Label>
            <Col sm="10">
            <Form.Control type="password" placeholder="비밀번호" name="password" />
            </Col>
        </Form.Group>

        <div align="center">
          <Button type="submit" variant="light" >로그인</Button>
        </div>

      </form></Card.Body>
    </Card>
  </Container>);
}

export default Login;