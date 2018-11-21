package teste.ifood.ui.pratos.detalhes

import teste.ifood.ui.base.BasePresenter

class DetailsPresenter : BasePresenter()
{
    private var detailsView : DetailsView? = null

    fun attachView(detailsView : DetailsView)
    {
        this.detailsView = detailsView
    }

    fun createActvitiy()
    {

    }
}