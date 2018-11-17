package dev.cesonha.bolha.common

import android.content.Context
import android.content.res.AssetManager
import android.content.res.Resources
import android.support.annotation.ColorRes
import android.support.annotation.StringRes
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.View



abstract class BaseViewHolder<T> : RecyclerView.ViewHolder {


        constructor(itemView: View): super(itemView)

        abstract fun bind(modelType: T)


        protected fun getContext(): Context {
            return itemView.context
        }

        protected fun getResources(): Resources {
            return itemView.context.resources
        }

        protected fun getAssets(): AssetManager {
            return itemView.context.assets
        }

        protected fun getString(@StringRes resId: Int, vararg formatArgs: Any): String {
            return itemView.context.getString(resId, *formatArgs)
        }

        protected fun getColor(@ColorRes resId: Int): Int {
            return ContextCompat.getColor(getContext(), resId)
        }
}