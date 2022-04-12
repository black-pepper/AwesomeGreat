import { Navbar, Container, Nav, NavDropdown, Form, FormControl, Button } from 'react-bootstrap';

function Nevbar() {
  return(
    <Navbar bg="light" expand="lg">
    <Container fluid>
        <Navbar.Brand href="#">굉장해! 엄청나!</Navbar.Brand>
        <Navbar.Toggle aria-controls="navbarScroll" />
        <Navbar.Collapse id="navbarScroll">
        <Nav
            className="me-auto my-2 my-lg-0"
            style={{ maxHeight: '100px' }}
            navbarScroll
        >
            <Nav.Link href="#action1">전체글보기</Nav.Link>
            <Nav.Link href="#action2">랜덤글보기</Nav.Link>
        </Nav>
        <Nav
            className="navbar-right"
        >
            <NavDropdown title="내 정보" id="collasible-nav-dropdown">
                <NavDropdown.Item href="#action3">마이페이지</NavDropdown.Item>
                <NavDropdown.Item href="#action1">로그아웃</NavDropdown.Item>
            </NavDropdown>
        </Nav>
        </Navbar.Collapse>
    </Container>
    </Navbar>
  );
}

export default Nevbar;