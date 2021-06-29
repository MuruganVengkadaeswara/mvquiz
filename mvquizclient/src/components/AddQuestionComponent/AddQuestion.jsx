import { Grid } from "@material-ui/core";
import { makeStyles, Typography } from "@material-ui/core";
import React from "react";
import { Form } from "react-bootstrap";
import AddQuestionUnit from "./AddQuestionUnit";

const useStyles = makeStyles((theme) => ({
  mainContent: {
    paddingLeft: "100px",
  },
  addqnBlk: {
    maxWidth: 400,
  },
}));

const AddQuestion = () => {
  const classes = useStyles();

  return (
    <div className={classes.mainContent}>
      <Grid className={classes.addqnBlk}>
        <Form>
          <AddQuestionUnit />
        </Form>
      </Grid>
    </div>
  );
};

export default AddQuestion;
