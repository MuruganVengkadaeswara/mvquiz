import React from "react";
import {
  Grid,
  makeStyles,
  Paper,
  Typography,
  GridList,
  GridListTile,
  Button,
  Card,
  Box,
} from "@material-ui/core";
import { Container, Divider } from "@material-ui/core";
import { Accordion } from "react-bootstrap";

const useStyles = makeStyles((theme) => ({
  root: {
    flexGrow: 1,
    paddingLeft: "100px",
  },
  paper: { height: 200, maxWidth: 600 },
  trybtn: {
    position: "absolute",
  },

  gridItem: {},
}));

const TestSets = ({ props }) => {
  const classes = useStyles();

  const testSetData = [
    {
      quesSetId: "1",
      quesSetName: "Abc",
      difficulty: "1",
      description:
        "asdasidaiosdoiasdoijasiodoaisjdoijasdasdasdsasdsdasdasdasdasdasdas",
      postedBy: "Name",
    },
    {
      quesSetId: "1",
      quesSetName: "Abcasdasdasdasdasdsa",
      difficulty: "1",
      description: "asdasidaiosdoiasdoijasiodoaisjdoij",
      postedBy: "Name",
    },
    {
      quesSetId: "1",
      quesSetName: "Abc",
      difficulty: "1",
      description: "asdasidaiosdoiasdoijasiodoaisjdoij",
      postedBy: "Name",
    },
    {
      quesSetId: "1",
      quesSetName: "Abc",
      difficulty: "1",
      description:
        "asdasidaiosdoiasdoijasiodoaisjdoiasdfdsfsdafasdfasdfasdfasdj",
      postedBy: "Name",
    },
  ];

  return (
    <div className={classes.root}>
      <GridList cellHeight={300} cols={2}>
        {testSetData.map((data) => (
          <Box p={5} spacing={2}>
            <Paper p={5} elevation={3} className={classes.paper}>
              <Typography noWrap variant="h4">
                {data.quesSetName}
              </Typography>
              <Divider />
              <Typography style={{ wordWrap: "break-word" }}>
                Description :<br></br>
                {data.description}
              </Typography>
              <Button
                className={classes.trybtn}
                variant="contained"
                color="primary"
              >
                Try
              </Button>
            </Paper>
          </Box>
        ))}
      </GridList>
    </div>
  );
};

export default React.memo(TestSets);
