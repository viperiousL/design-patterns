package com.itheima.pattern.state.before;

/**
 * @version v1.0
 * @ClassName: Lift
 * @Description: 电梯类(ILift的子实现类)
 * @Author: 黑马程序员
 */
public class Lift implements ILift {

    /**
     * 声明一个记录当前电梯的状态
     */
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        //当前电梯状态
        switch (state) {
            case OPENING_STATE:
                //什么事都不做
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了...");
                //设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了...");
                //设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                //什么事都不做
                break;
            default:
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                //只有开门状态可以关闭电梯门，可以对应电梯状态表来看
                System.out.println("电梯关门了。。。");
                //关门之后电梯就是关闭状态了
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                //do nothing //已经是关门状态，不能关门
                break;
            case RUNNING_STATE:
                //do nothing //运行时电梯门是关着的，不能关门
                break;
            case STOPPING_STATE:
                //do nothing //停止时电梯也是关着的，不能关门
                break;
            default:
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            //电梯不能开着门就走
            case OPENING_STATE:
                //do nothing
                break;
            //门关了，可以运行了
            case CLOSING_STATE:
                System.out.println("电梯开始运行了。。。");
                //现在是运行状态
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                //do nothing 已经是运行状态了
                break;
            case STOPPING_STATE:
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);
                break;
            default:
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            //开门的电梯已经是是停止的了(正常情况下)
            case OPENING_STATE:
                //do nothing
                break;
            //关门时才可以停止
            case CLOSING_STATE:
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
            //运行时当然可以停止了
            case RUNNING_STATE:
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                //do nothing
                break;
            default:
                break;
        }
    }
}
