import React from 'react';
import { Container, Form, Row, Col, Card, Button } from 'react-bootstrap';
import Nevbar from "./Nevbar";

function Join() {
  return (<Container>
    <Nevbar />
    <Card>
      <Card.Body><form action="/join" method="post">

        <Form.Group as={Row} className="mb-3" controlId="formPlaintextPassword">
            <Form.Label column sm="2">
            아이디
            </Form.Label>
            <Col sm="10">
            <Form.Control type="id" name="id" placeholder="아이디" />
            </Col>
        </Form.Group>

        <Form.Group as={Row} className="mb-3" controlId="formPlaintextPassword">
            <Form.Label column sm="2">
            비밀번호
            </Form.Label>
            <Col sm="10">
            <Form.Control type="password" name="password" placeholder="비밀번호" />
            </Col>
        </Form.Group>

        <div align="center">
          <Button type="submit" variant="light" >회원 가입</Button>
          <Button src="/main" variant="light" >취소</Button>
        </div>

      </form></Card.Body>
    </Card>
  </Container>);
}

export default Join;