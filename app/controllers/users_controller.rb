class UsersController < ApplicationController

  def index
    @users = User.find(params[:id])
    @member = @users.group_user.where(:group_id).first
    # @member = Group.find(params[:id]).users.map(&:name)
  end

  def edit
    @user = User.new
  end

  def update
    if current_user.update(user_params)
      redirect_to root_path
    else
      render :edit
    end
  end

  private
  def user_params
    params.require(:user).permit(:name, :email)
  end

end
