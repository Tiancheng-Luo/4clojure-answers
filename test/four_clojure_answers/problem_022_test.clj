(ns four-clojure-answers.problem-022-test
  (:use four-clojure-answers.problem-022
        clojure.test))

(deftest problem-022-test
  (doseq [answer [answer-a answer-b]]
    (are [coll expected]
      (= (answer coll) expected)
      '(1 2 3 3 1) 5
      "Hello World" 11
      [[1 2] [3 4] [5 6]] 3
      '(13) 1
      '(:a :b :c) 3)))
