package org.example.visitor;
// all the highlight logic operation is in the one single place
public class HighlighOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("heading-highlight");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("anchor-highlight");
    }
}
