import { Grid, Typography, Divider } from "@material-ui/core";
import { makeStyles } from "@material-ui/core";
import React from "react";
import Paper from "@material-ui/core/Paper";
import { Carousel } from "react-bootstrap";
import image1 from "../HomeComponent/images/dev.jpg";
import image2 from "../HomeComponent/images/dev1.jpg";
import image3 from "../HomeComponent/images/dev2.jpg";

const useStyles = makeStyles((theme) => ({
  mainContent: {
    paddingLeft: "100px",
  },
}));

const HomeContents = () => {
  const classes = useStyles();

  return (
    <>
      <Grid className={classes.mainContent}>
        <Grid container>
          <Typography variant="h4">
            Welcome to MvQuiz
            <Divider />
            <Typography variant="h6">
              An Interactive, RealTime Quiz application great flexibility and
              stablilty.
            </Typography>
          </Typography>
        </Grid>
      </Grid>
    </>
  );
};

export default React.memo(HomeContents);
