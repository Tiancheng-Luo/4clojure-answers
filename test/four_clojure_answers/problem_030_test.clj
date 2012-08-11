(ns four-clojure-answers.problem-030-test
  (:use four-clojure-answers.problem-030
        clojure.test))

(deftest problem-030-test
  (are [coll expected]
    (= (answer coll) expected)
    "Leeeeeerrroyyy" (seq "Leroy")
    [1 1 2 3 3 2 2 3] '(1 2 3 2 3)
    [[1 2] [1 2] [3 4] [1 2]] '([1 2] [3 4] [1 2])))
