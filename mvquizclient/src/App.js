import HomeComponent from "./components/HomeComponent/HomeComponent";
import QuestionComponent from "./components/QuestionComponent/QuestionComponent";

import {
  Link,
  withRouter,
  BrowserRouter as Router,
  Route,
  Switch,
  Redirect,
} from "react-router-dom";
import MyAccountUser from "./components/MyAccountComponent/MyAccountUser";
import HomeContents from "./components/HomeComponent/HomeContents";
import TestSets from "./components/TestSetComponents/TestSet/TestSet";

function App() {
  const questionData = {
    quesId: "1",
    quesString: "Who found linux?",
    quesType: "MCQ",
    options: ["linus", "gates", "musk", "bezos"],
  };

  return (
    <div>
      {/* <QuestionComponent questionData={questionData}/> */}
      <Router>
        <Route path="/" component={HomeComponent} />
        <Route exact path="/" component={HomeContents} />
        <Route path="/myaccount" component={MyAccountUser} />
        <Route path="/testsets" component={TestSets} />
      </Router>
      {/* <HomeComponent /> */}
      {/* <MyAccountUser/> */}
    </div>
  );
}

export default App;
