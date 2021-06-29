import { makeStyles } from "@material-ui/core";
import React from "react";
import { Form } from "react-bootstrap";

const useStyle = makeStyles((theme) => ({
  maincontent: {
    paddingLeft: "100px",
  },
}));

const AddQuestionUnit = ({ quesUnitData }) => {
  return (
      <Form.Group>
        <Form.Label>{quesUnitData.quesString}</Form.Label>
        <Form.Control type="text"></Form.Control>
      </Form.Group>
  );
};

export default React.memo(AddQuestionUnit);
