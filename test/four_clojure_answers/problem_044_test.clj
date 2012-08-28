(ns four-clojure-answers.problem-044-test
  (:use four-clojure-answers.problem-044
        clojure.test))

(deftest problem-044-test
  (doseq [answer [answer-a answer-b]]
    (are [n coll expected]
      (= (answer n coll) expected)
      2 [1 2 3 4 5] '(3 4 5 1 2)
      -2 [1 2 3 4 5] '(4 5 1 2 3)
      6 [1 2 3 4 5] '(2 3 4 5 1)
      1 '(:a :b :c) '(:b :c :a)
      -4 '(:a :b :c) '(:c :a :b))))
