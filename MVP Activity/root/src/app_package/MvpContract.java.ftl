package ${packageName}.contract;

public interface ${activityClass}Contract {

    interface Presenter<T> {
        void succeed(T t);
        void failed(T t);
        void error(Throwable e);
        void subscribe();
        void unSubscribe();
    }

    interface View<T> {
        void setPresenter(Presenter presenter);
        void succeed(T t);
        void failed(T t);
        void error(Throwable e);
    }


    interface Model {
        void setPresenter(Presenter presenter);
    }


}