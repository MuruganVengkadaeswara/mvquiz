import HomeComponent from "./components/HomeComponent/HomeComponent";
import QuestionComponent from "./components/QuestionComponent/QuestionComponent";

function App() {
  const questionData = {
    quesId : "1",
    quesString: "Who found linux?",
    quesType: "MCQ",
    options: ["linus", "gates", "musk", "bezos"],
  };

  return (
    <div>
      {/* <QuestionComponent questionData={questionData}/> */}
      <HomeComponent/>
    </div>
  );
}

export default App;
