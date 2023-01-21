package org.example.visitor;

public interface Operation {
    void apply(HeadingNode headingNode);
    void apply(AnchorNode anchorNode);
}
