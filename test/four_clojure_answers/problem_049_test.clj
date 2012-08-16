(ns four-clojure-answers.problem-049-test
  (:use four-clojure-answers.problem-049
        clojure.test))

(deftest problem-049-test
  (are [n coll expected]
    (= (answer n coll) expected)
    3 [1 2 3 4 5 6] [[1 2 3] [4 5 6]]
    1 [:a :b :c :d] [[:a] [:b :c :d]]
    2 [[1 2] [3 4] [5 6]] [[[1 2] [3 4]] [[5 6]]]))
