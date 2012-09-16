(ns four-clojure-answers.problem-078)

(def answer
  (fn [f & args]
    (loop [g (apply f args)]
      (if (fn? g)
        (recur (g))
        g))))
