import { Container, Grid, makeStyles, Typography } from "@material-ui/core";
import React from "react";

const useStyles = makeStyles((theme) => ({
  mainContent: {
    paddingLeft: "100px",
  },
}));

const MyAccountUser = () => {
  const classes = useStyles();

  const userData = {
    userName: "Murugan Vengkadaeswara",
  };

  return (
    <Grid className={classes.mainContent}>
      <Typography variant="h5">Welcome, <br/> {userData.userName}.</Typography>
    </Grid>
  );
};

export default React.memo(MyAccountUser);
