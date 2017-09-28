package com.wmb.patterns.decorator;

/**
 * Created by robertmurray on 8/26/17.
 */
public class VerticleScrollBarDecorator extends WindowDecorator {
        public VerticleScrollBarDecorator (Window windowToBeDecorated) {
            super(windowToBeDecorated);
        }

        @Override
        public void draw() {
            super.draw();
            drawVerticalScrollBar();
        }

        private void drawVerticalScrollBar() {
            // Draw the vertical scrollbar
        }

        @Override
        public String getDescription() {
            return super.getDescription() + ", including vertical scrollbars";
        }

}
