package divyansh.tech.animeclassroom.manga.epoxy

import androidx.databinding.ViewDataBinding
import com.airbnb.epoxy.DataBindingEpoxyModel
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.databinding.BR
import divyansh.tech.animeclassroom.R
import divyansh.tech.animeclassroom.common.AnimeClickCallback
import divyansh.tech.animeclassroom.common.data.Manga

@EpoxyModelClass(layout = R.layout.recycler_manga_item_view)
abstract class EpoxyMangaModel: DataBindingEpoxyModel() {
    @EpoxyAttribute
    lateinit var manga: Manga

    @EpoxyAttribute
    lateinit var clickCallback: AnimeClickCallback

    override fun setDataBindingVariables(binding: ViewDataBinding) {
        binding.setVariable(BR.manga, manga)
        binding.setVariable(BR.mangaCallback, clickCallback)
    }
}