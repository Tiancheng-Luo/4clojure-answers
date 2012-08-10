(ns four-clojure-answers.problem-019)

(def answer
  (fn [coll]
    (if-let [rest-coll (next coll)]
      (recur rest-coll)
      (first coll))))
