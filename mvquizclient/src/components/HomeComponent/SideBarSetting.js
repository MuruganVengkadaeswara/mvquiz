import TrendingUpIcon from "@material-ui/icons/TrendingUp";
import StorageIcon from "@material-ui/icons/Storage";
import AccountCircleIcon from "@material-ui/icons/AccountCircle";
import SettingsIcon from "@material-ui/icons/Settings";
import LibraryBooksRoundedIcon from "@material-ui/icons/LibraryBooksRounded";
import AssignmentRoundedIcon from "@material-ui/icons/AssignmentRounded";
import EmailRoundedIcon from "@material-ui/icons/EmailRounded";
import RateReviewRoundedIcon from "@material-ui/icons/RateReviewRounded";

const adminSetting = [
  {
    settingName: "Metrics",
    icon: <TrendingUpIcon />,
  },
  {
    settingName: "Quiz Repository",
    icon: <StorageIcon />,
  },
];

const userSetting = [
  {
    settingName: "My Account",
    icon: <AccountCircleIcon />,
    url:"/myaccount"
  },
  {
    settingName: "Test Sets",
    icon: <AssignmentRoundedIcon />,
    url:"/testsets"
  },
  {
    settingName: "My Results",
    icon: <LibraryBooksRoundedIcon />,
    url:"/results"

  },
  {
    settingName: "Account Settings",
    icon: <SettingsIcon />,
  },
];

const userSettingSecondary = [
  {
    settingName: "Post a Test Set",
    icon: <EmailRoundedIcon />,
  },
  {
    settingName: "Write to us",
    icon: <RateReviewRoundedIcon />,
  },
];
const adminSettingSecondary = [
  {
    settingName: "Post a Test Set",
    icon: <EmailRoundedIcon />,
  },
  {
    settingName: "Write to us",
    icon: <RateReviewRoundedIcon />,
  },
];

export {
  adminSetting,
  userSetting,
  userSettingSecondary,
  adminSettingSecondary,
};
