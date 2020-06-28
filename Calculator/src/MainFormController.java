import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;

public class MainFormController {
    public JFXTextField txt;



    private void setText(String value){
        txt.setText(txt.getText()+value);
    }

    public void btn1OnAction(ActionEvent actionEvent) {setText("1");
    }

    public void btn2OnAction(ActionEvent actionEvent) {setText("2");
    }

    public void btn3OnAction(ActionEvent actionEvent) {setText("3");
    }

    public void btn4OnAction(ActionEvent actionEvent) {setText("4");
    }

    public void btn5OnAction(ActionEvent actionEvent) {setText("5");
    }

    public void btn6OnAction(ActionEvent actionEvent) {setText("6");
    }

    public void btn7OnAction(ActionEvent actionEvent) {setText("7");
    }

    public void btn8OnAction(ActionEvent actionEvent) {setText("8");
    }

    public void btn9OnAction(ActionEvent actionEvent) {setText("9");
    }

    public void btn0OnAction(ActionEvent actionEvent) {setText("0");
    }


}
