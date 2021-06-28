import React from "react";
import { Form } from "react-bootstrap";

const QuestionComponent = ({ questionData }) => {
  return (
    <div>
      <h1>{questionData.quesString}</h1>
      {questionData.options &&
        questionData.options.map((value) => (
            <option>{value}</option>
        ))}
    </div>
  );
};

export default React.memo(QuestionComponent);
