(ns four-clojure-answers.problem-122-test
  (:use four-clojure-answers.problem-122
        clojure.test))

(deftest problem-122-test
  (doseq [answer [answer-a answer-b]]
    (are [bit-str expected]
      (= (answer bit-str) expected)
      "0"                 0
      "111"               7
      "1000"              8
      "1001"              9
      "11111111"          255
      "10101010101"       1365
      "1111111111111111"  65535)))
