(ns four-clojure-answers.problem-120-test
  (:use four-clojure-answers.problem-120
        clojure.test))

(deftest problem-120-test
  (doseq [answer [answer-a answer-b]]
    (are [coll expected]
      (= (answer coll) expected)
      (range 10) 8
      (range 30) 19
      (range 100) 50
      (range 1000) 50)))
