package org.example.visitor;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("heading-plaintext");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("anchor-plaintext");
    }
}
