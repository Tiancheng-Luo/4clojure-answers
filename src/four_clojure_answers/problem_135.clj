(ns four-clojure-answers.problem-135)

(def answer
  (fn [l & more]
    (reduce
      (fn [l [o r]] (o l r))
      l
      (partition 2 more))))
