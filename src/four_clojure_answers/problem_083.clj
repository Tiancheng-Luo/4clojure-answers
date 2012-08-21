(ns four-clojure-answers.problem-083)

(def answer
  (fn [& bools]
    (boolean
      (and (some true? bools)
           (not-every? true? bools)))))
