(ns four-clojure-answers.problem-019)

(def answer-019
  (fn [coll]
    (if-let [rest-coll (next coll)]
      (recur rest-coll)
      (first coll))))
