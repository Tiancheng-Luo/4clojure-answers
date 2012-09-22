(ns four-clojure-answers.problem-078)

(def answer
  (fn [f & args]
    (loop [r (apply f args)]
      (if (fn? r)
        (recur (r))
        r))))
