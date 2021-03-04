package ru.netology.domain;

public class RepostsInfo {
    private int count;           //счетчик
    private boolean canRepost;   //можно сделать репост

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }
}
