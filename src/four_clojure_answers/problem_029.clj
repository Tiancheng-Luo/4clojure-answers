(ns four-clojure-answers.problem-029)

(def answer
  (comp (partial apply str)
        (partial filter #(Character/isUpperCase %))))
