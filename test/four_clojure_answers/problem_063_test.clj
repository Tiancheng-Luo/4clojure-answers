(ns four-clojure-answers.problem-063-test
  (:use four-clojure-answers.problem-063
        clojure.test))

(deftest problem-063-test
  (are [f s expected]
    (= (answer f s) expected)
    #(> % 5) [1 3 6 8] {false [1 3], true [6 8]}
    #(apply / %) [[1 2] [2 4] [4 6] [3 6]] {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]}
    count [[1] [1 2] [3] [1 2 3] [2 3]] {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]}))
