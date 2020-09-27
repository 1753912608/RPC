package rpc.demo.service;

public class TestServiceImpl implements TestService{
    @Override
    public int del() {
        return 1;
    }

    @Override
    public int ins() {
        return 2;
    }

    @Override
    public int upd() {
        return 3;
    }

    @Override
    public int sel() {
        return 4;
    }
}
