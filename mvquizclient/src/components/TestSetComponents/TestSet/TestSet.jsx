import React from "react";
import { Grid, makeStyles, Paper } from "@material-ui/core";
import { Container } from "@material-ui/core";
import { Accordion } from "react-bootstrap";

const useStyles = makeStyles((theme) => ({
  mainContent: {
    paddingLeft: "100px",
  },
}));

const TestSets = () => {
  const classes = useStyles();

  const testSetData = [
    {
      quesSetId: "1",
      quesSetName: "Abc",
      difficulty: "1",
    },
    {
      quesSetId: "1",
      quesSetName: "Abc",
      difficulty: "1",
    },
    {
      quesSetId: "1",
      quesSetName: "Abc",
      difficulty: "1",
    },
    {
      quesSetId: "1",
      quesSetName: "Abc",
      difficulty: "1",
    },
  ];

  return (
    <>
      <Grid className={classes.mainContent}>
        {testSetData.map((data) => (
          <Accordion></Accordion>
        ))}
      </Grid>
    </>
  );
};

export default React.memo(TestSets);
