package org.example.mediator;

public class ArticlesDialogBox extends DialogBox {
    private ListBox articlesListBox = new ListBox(this);
    private Button  saveButton = new Button(this);
    private TextBox titleTextBox = new TextBox(this);

    @Override
    public void changed(UIControl control) {
        if(control == articlesListBox){
            titleTextBox.setContent(articlesListBox.getSelection());
            saveButton.setEnabled(true);
        } else if(control == titleTextBox) {
            String content = titleTextBox.getContent();
            if(content == null || content.isEmpty()) {
                saveButton.setEnabled(false);
            }
        }
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("mehrab");
        System.out.println("Textbox: " + titleTextBox.getContent());
    }
}
