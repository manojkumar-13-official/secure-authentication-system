import { Link } from "react-router-dom";

const LoginPage = () => {
  return (
    <section className="w-full max-w-md px-4">
      <div className="relative overflow-hidden rounded-3xl border border-red-500/40 bg-gray-900/90 p-8 shadow-2xl shadow-red-950/50">
        <div className="absolute -right-20 -top-20 h-44 w-44 rounded-full bg-red-600/20 blur-3xl" />
        <div className="absolute -bottom-24 -left-20 h-52 w-52 rounded-full bg-red-700/20 blur-3xl" />

        <div className="relative">
          <div className="mb-8 text-center">
            <p className="mb-2 text-sm font-semibold uppercase tracking-[0.35em] text-red-400">
              Welcome back
            </p>
            <h1 className="text-4xl font-bold text-white">Login</h1>
            <p className="mt-3 text-sm text-gray-400">
              Sign in to continue to your dashboard
            </p>
          </div>

          <form className="space-y-5">
            <div>
              <label
                htmlFor="email"
                className="mb-2 block text-sm font-medium text-gray-200"
              >
                Email address
              </label>
              <input
                type="email"
                name="email"
                id="email"
                placeholder="Enter your email"
                className="w-full rounded-xl border border-red-500/30 bg-gray-950 px-4 py-3 text-white outline-none transition placeholder:text-gray-600 focus:border-red-500 focus:ring-4 focus:ring-red-600/20"
              />
            </div>

            <div>
              <div className="mb-2 flex items-center justify-between">
                <label
                  htmlFor="password"
                  className="block text-sm font-medium text-gray-200"
                >
                  Password
                </label>
                <button
                  type="button"
                  className="text-sm font-medium text-red-400 transition hover:text-red-300"
                >
                  Forgot?
                </button>
              </div>
              <input
                type="password"
                name="password"
                id="password"
                placeholder="Enter your password"
                className="w-full rounded-xl border border-red-500/30 bg-gray-950 px-4 py-3 text-white outline-none transition placeholder:text-gray-600 focus:border-red-500 focus:ring-4 focus:ring-red-600/20"
              />
            </div>

            <button
              type="submit"
              className="w-full rounded-xl bg-red-600 px-4 py-3 font-semibold text-white shadow-lg shadow-red-950/50 transition hover:bg-red-500 focus:outline-none focus:ring-4 focus:ring-red-600/30"
            >
              Login
            </button>
          </form>

          <p className="mt-6 text-center text-sm text-gray-400">
            Don't have an account?{" "}
            <Link
              to="/register"
              className="font-semibold text-red-400 transition hover:text-red-300"
            >
              Register
            </Link>
          </p>
        </div>
      </div>
    </section>
  );
};

export default LoginPage;
