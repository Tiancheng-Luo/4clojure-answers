(ns four-clojure-answers.problem-070)

(def answer
  (comp (partial sort-by clojure.string/lower-case)
        (partial re-seq #"\w+")))
