(ns four-clojure-answers.problem-028)

(def answer
  (fn my-flatten [x]
    (if (sequential? x)
      (mapcat my-flatten x)
      (list x))))
