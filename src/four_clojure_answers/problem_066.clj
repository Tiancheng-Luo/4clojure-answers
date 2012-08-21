(ns four-clojure-answers.problem-066)

(def answer
  (fn [m n]
    (if (zero? n)
      m
      (recur n (rem m n)))))
