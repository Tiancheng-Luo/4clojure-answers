(ns four-clojure-answers.problem-030)

(def answer
  (comp (partial map first)
        (partial partition-by identity)))
