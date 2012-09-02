(ns four-clojure-answers.problem-070-test
  (:use four-clojure-answers.problem-070
        clojure.test))

(deftest problem-070-test
  (are [s expected]
    (= (answer s) expected)
    "Have a nice day."
    ["a" "day" "Have" "nice"]

    "Clojure is a fun language!"
    ["a" "Clojure" "fun" "is" "language"]

    "Fools fall for foolish follies."
    ["fall" "follies" "foolish" "Fools" "for"]))
